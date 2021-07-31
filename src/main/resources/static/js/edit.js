var entryTime = document.getElementById("entry-time");
var departureTime = document.getElementById("departure-time");
var entryHour = document.getElementById("entry-hour");
var departureHour = document.getElementById("departure-hour");



if (entryTime.value != (null || "" || entryTime.value.lenght == 0) ) {
    entryTime.style.display = "none";
    let spanEntryTime = document.createElement("span");
    entryHour.appendChild(spanEntryTime);
    spanEntryTime.innerHTML ='<span class="form-text text-muted">Horario de entrada já foi inserido</span>';
    console.log(typeof entryTime.value);
}

if (departureTime.value != (null || "" || departureTime.value.lenght == 0) ) {
    departureTime.style.display = "none";
    let spanDepartureTime = document.createElement("span");
    departureHour.appendChild(spanDepartureTime)
    spanDepartureTime.innerHTML = '<span class="form-text text-muted">Horario de saída já foi inserido</span>';
    console.log(typeof departureTime.value);
}

