window.onload = customize;

function customize(){
	window.document.getElementById('div3').style.display = 'none';
}

function capitalReturn()
{
    window.document.getElementById('div3').style.display = 'none';
	var q_str = 'type=number&value='+document.getElementById('t1').value;
	doAjax('Capital_servlet',q_str,'capitalReturnBack','post',0);
}
function capitalReturnBack(result)
{
	if (result.substring(0,5)=='error'){
	   window.document.getElementById('div3').style.display = 'block';
	   window.document.getElementById('div3').innerHTML="<p style='color:red;'><b>"+result.substring(6)+"</b></p>";
   }else{
	   window.document.getElementById('t2').value=""+result;
   }
}

