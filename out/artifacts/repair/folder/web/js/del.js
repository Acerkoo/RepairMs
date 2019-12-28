function  ma(ID)
{

	if(confirm("确认删除吗?"))
		{

		location.href="DeleteSpareServlet?ID="+ID;
		}
	
}
function getNum(){
	var num=document.getElementById("fixID").value;
	return num;
}
