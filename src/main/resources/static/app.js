$(function(){
    // Activate mobile nav toggle button
    $(".button-collapse").sideNav({edge: 'right'});
});

function copyText() {
    // get the text field
    const textField = document.getElementById('copy-link').innerHTML;
    // copy link text to clipboard
    navigator.clipboard.writeText(textField)
        .then(() => alert('Text copied to clipboard'))
        .catch(err => alert('Error in copying text: ' + err.message));
};