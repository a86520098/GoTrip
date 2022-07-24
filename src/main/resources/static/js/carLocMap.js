jQuery(document).ready(function($) {

	mapboxgl.accessToken = 'pk.eyJ1IjoibHlubjgxMTExMiIsImEiOiJjbDFha2phZ28yN2tqM2RwMzZ4YncycHl5In0.QtgMdcDbNV24FrpgU4sHCw';
	
	
	let lng = $('#longitude').text()
	let lat = $('#latitude').text()
	let companyName = $('#companyName').text()
	let locationName = $('#locationName').text()
	
	
	const map = new mapboxgl.Map({
	    container: 'map',
	    style: 'mapbox://styles/mapbox/light-v10', // stylesheet location
	    center: [lng, lat], // starting position [lng, lat]
	    zoom: 12 // starting zoom
	});
	
	map.addControl(new mapboxgl.NavigationControl());
	
	// Create a new marker.
	const marker = new mapboxgl.Marker()
	    .setLngLat([lng, lat])
	    .setPopup(
	        new mapboxgl.Popup({ offset: 20 })
	            .setHTML(
	                '<h6 class="mtext-106 font-weight-bold">'+ companyName +'</h6><h5 class="font-weight-bold">' + locationName + '</h5>'
	            )
	    )
	    .addTo(map);
	    
    mapboxgl.setRTLTextPlugin('https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-rtl-text/v0.2.3/mapbox-gl-rtl-text.js');
	map.addControl(new MapboxLanguage({
		defaultLanguage: 'zh-Hant'
	}));
    
})