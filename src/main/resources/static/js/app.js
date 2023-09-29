async function getContent(entry) {
    const text = await fetch(entry).then(response => response.text());
    $('#app').html(text);
}

