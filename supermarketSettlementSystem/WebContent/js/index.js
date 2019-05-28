window.onload = function() {
	var total = document.getElementById("total");
	var yingfu = document.getElementById("yingfu");
	var shifu = document.getElementById("shifu");
	var zhaoling = document.getElementById("zhaoling");
	var jisuanqi = document.getElementById("jisuanqi");
	var btn = jisuanqi.getElementsByTagName("input");
	var que=document.getElementById("que");
	var del=document.getElementById("del");
	var wei=document.getElementById("wei");
	var zhi=document.getElementById("zhi");
	var img1=document.getElementById("img1");
	var img2=document.getElementById("img2");
	//	var btn=jisuanqi.getElementsByTagName("button");
	
	//为btn元素循环添加onclick事件
	for(var i=0;i<btn.length;i++){
		
		btn[i].onclick=function(){
			t =this.value;
			//把t转为数字
			
			var t1=Number(t);
			console.log(t1);
			if(!isNaN(t1)||t=="."){
				shifu.value+=t;
			}
			
		}
		
	}
	yingfu.value = total.innerText;
	//确认键点击
	que.onclick=function(){
		if(shifu.value>=yingfu.value){
		zhaoling.value=shifu.value-yingfu.value;
		}
	}
	//删除键点击
	del.onclick=function(){
		shifu.value="";
		zhaoling.value="";
	}
	//微信点击事件
	var flag=1;
	wei.onclick=function(){
		if(flag==1){
			img1.style.display='block';
			flag=0;
		}else{
			img1.style.display='none';
			flag=1;
		}
	}
	var flag2
	zhi.onclick=function(){
		if(flag2==1){
			img2.style.display='block';
			flag2=0;
		}else{
			img2.style.display='none';
			flag2=1;
		}
	}
	
}