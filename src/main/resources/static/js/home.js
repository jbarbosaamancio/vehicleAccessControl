var entryTime = document.getElementsByClassName("entry-time");
var departureTime = document.getElementsByClassName("departure-time");

for (let index = 0; index < entryTime.length; index++) {
    const element = entryTime[index];
    if (element.innerText != (null || "") ){
        let entryTimeConverted = new Date(element.innerText)
        element.innerText = entryTimeConverted.toLocaleString();
    }
    else{
        element.innerText = "Horário de entrada não inserido"
    }
}

for (let index = 0; index < departureTime.length; index++) {
    const element = departureTime[index];
    if (element.innerText != (null || "") ){
        var departureTimeConverted = new Date(element.innerText);
        element.innerText = departureTimeConverted.toLocaleString();
    }
    else{
        element.innerText = "Horário de saída não inserido"
    }
    
}