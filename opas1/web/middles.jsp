<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/lib/w3.css">
<style>
.mySlides {display:none;}
</style>
<body bgcolor="">

<div class="w3-content w3-section" style="max-width:500px">
  <img class="mySlides w3-animate-right" src="re.jpg" style="width:200%;height:90%">
  <img class="mySlides w3-animate-right" src="b.jpg" style="width:200%;height:90%">
  <img class="mySlides w3-animate-right" src="c.jpg" style="width:200%;height:88%">
  <img class="mySlides w3-animate-right" src="d.jpg" style="width:200%;height:90%">
  <img class="mySlides w3-animate-right" src="e.gif" style="width:200%;height:90%">
  <img class="mySlides w3-animate-right" src="f.png" style="width:200%;height:90%">
</div>
<div>
<img src="footer.jpg">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
      x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 3000);    
}
</script>
</center>
</body>
</html>
