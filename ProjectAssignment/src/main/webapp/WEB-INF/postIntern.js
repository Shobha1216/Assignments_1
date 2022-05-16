async function postInterns(){
    // alert("hi")
    // document.getElementById("myform1").addEventListener('submit',async function(event){
    //     event.preventDefault();
    url="http://localhost:8081/ProjectAssignment/interns/createIntern";
    var internId=document.getElementById("id").value;
    console.log(internId);
    var internName=document.getElementById("name").value;
    console.log(internName);
    var email=document.getElementById("email").value;
    var phoneNo=document.getElementById("Phoneno").value;
    var imageUrl=document.getElementById("url").value
    let data={
        internId:internId,
        internName:internName,
        email:email,
        phoneNo:phoneNo,
        imageUrl:imageUrl

    };

    console.log(data);

    await fetch(url,{
        method:"post",
        headers : {
            'Content-Type':'application/json',
            'Accepts':'application/json'

        },
        body: JSON.stringify(data)
    })
    .then(res=>res.json())
    .then(data=>{
        alert("came here")
        console.log(data);
        alert("came here")
          success();
         
    });
    window.location.href="practice.html"
}
function success(){
    alert(hi);
    var x=document.getElementById("snackbar1");
    x.className="show";
    setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
    setTimeout(function(){  window.location.href="practice.html"}, 3000);
}

// function error(){
//     var x=document.getElementById("snackbar1");
//     x.className="show";
//     setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);

// }