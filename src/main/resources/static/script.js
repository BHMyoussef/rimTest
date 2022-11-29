var {longitude, latitude} = points[0];
var initZoom = 15;
var map = L.map('map').setView([latitude, longitude], initZoom);

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 19,
    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">RMI Telecom</a>'
}).addTo(map);

var latlngs = [];
latlngs = points.map(point=>[...[point.latitude, point.longitude]])
var polyline = L.polyline(latlngs, {
    color: 'red',
    weight: 5,
    smoothFactor: 1
});
polyline.addTo(map)

var myMovingMarker = L.Marker.movingMarker(latlngs,
    60000, {
        autostart: false
    }).addTo(map);

var initMarker = L.marker(latlngs[0]).addTo(map);
initMarker.bindPopup("<b>click to start</b>").openPopup();
initMarker.on('click', function () {
    myMovingMarker.start();
    trackMarker();
    map.removeLayer(initMarker);
});
function trackMarker(){
    setTimeout(()=>{
        map.setView(myMovingMarker.getLatLng(), initZoom);
        points.find()
        if(!myMovingMarker.isEnded())
            trackMarker();
    },200)
}

