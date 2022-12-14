mapboxgl.accessToken = 'pk.eyJ1IjoibHlubjgxMTExMiIsImEiOiJjbDFha2phZ28yN2tqM2RwMzZ4YncycHl5In0.QtgMdcDbNV24FrpgU4sHCw';
const map = new mapboxgl.Map({
	container: 'map',
	style: 'mapbox://styles/mapbox/outdoors-v11',
	center: [121.5328, 25.0456],
	zoom: 10
});

mapboxgl.setRTLTextPlugin('https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-rtl-text/v0.2.3/mapbox-gl-rtl-text.js');
map.addControl(new MapboxLanguage({
	defaultLanguage: 'zh-Hant'
}));

map.addControl(new mapboxgl.NavigationControl());

map.on('load', () => {
	
	map.addSource('my-data', {
		"type": "geojson",
		'data': "/gotrip/api/cars/locations/geojson",
		cluster: true,
		clusterMaxZoom: 14, // Max zoom to cluster points on
		clusterRadius: 50 // Radius of each cluster when clustering points (defaults to 50)
	});

	map.addLayer({
		id: 'clusters',
		type: 'circle',
		source: 'my-data',
		filter: ['has', 'point_count'],
		paint: {
			// Use step expressions (https://docs.mapbox.com/mapbox-gl-js/style-spec/#expressions-step)
			// with three steps to implement three types of circles:
			//   * Blue, 20px circles when point count is less than 100
			//   * Yellow, 30px circles when point count is between 100 and 750
			//   * Pink, 40px circles when point count is greater than or equal to 750
			'circle-color': [
				'step',
				['get', 'point_count'],
				'#ed7e07',
				5,
				'#f1f075',
				10,
				'#f28cb1'
			],
			'circle-radius': [
				'step',
				['get', 'point_count'],
				20,
				10,
				25,
				50,
				30
			]
		}
	});

	map.addLayer({
		id: 'cluster-count',
		type: 'symbol',
		source: 'my-data',
		filter: ['has', 'point_count'],
		layout: {
			'text-field': '{point_count_abbreviated}',
			'text-font': ['DIN Offc Pro Medium', 'Arial Unicode MS Bold'],
			'text-size': 12
		}
	});

	map.addLayer({
		id: 'unclustered-point',
		type: 'circle',
		source: 'my-data',
		filter: ['!', ['has', 'point_count']],
		paint: {
			'circle-color': '#ed7e07',
			'circle-radius': 4,
			'circle-stroke-width': 1,
			'circle-stroke-color': '#fff'
		}
	});


	// inspect a cluster on click
	map.on('click', 'clusters', (e) => {
		const features = map.queryRenderedFeatures(e.point, {
			layers: ['clusters']
		});
		const clusterId = features[0].properties.cluster_id;
		map.getSource('my-data').getClusterExpansionZoom(
			clusterId,
			(err, zoom) => {
				if (err) return;

				map.easeTo({
					center: features[0].geometry.coordinates,
					zoom: zoom
				});
			}
		);
	});

	// When a click event occurs on a feature in
	// the unclustered-point layer, open a popup at
	// the location of the feature, with
	// description HTML from its properties.
	map.on('mouseenter', 'unclustered-point', (e) => {
		const popUpMarkup = '<a href="#'+e.features[0].properties.id+'"><h5 class="font-weight-bold">' + e.features[0].properties.name + '</h5></a>';
		const coordinates = e.features[0].geometry.coordinates.slice();
		// Ensure that if the map is zoomed out such that
		// multiple copies of the feature are visible, the
		// popup appears over the copy being pointed to.
		while (Math.abs(e.lngLat.lng - coordinates[0]) > 180) {
			coordinates[0] += e.lngLat.lng > coordinates[0] ? 360 : -360;
		}

		new mapboxgl.Popup()
			.setLngLat(coordinates)
			.setHTML(popUpMarkup)
			.addTo(map);
	});

	map.on('mouseenter', 'clusters', () => {
		map.getCanvas().style.cursor = 'pointer';
	});
	map.on('mouseleave', 'clusters', () => {
		map.getCanvas().style.cursor = '';
	});
});