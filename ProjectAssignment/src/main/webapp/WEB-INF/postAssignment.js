async function postAssignment(){
    document.getElementById("myform").addEventListener("submit",async function(event){
        event.preventDefault();
        alert("hi")
    url="http://localhost:8081/ProjectAssignment/createAssignment";
    var id=document.getElementById("id").value;
    var name=document.getElementById("assignmentname").value;
    var description=document.getElementById("description").value
    let data={
        assignmentId :id,
        assignmentName:name,
        assignmentdescription:description

    };

    console.log(data);
    

    // params={
    // method :'POST',
    // headers:{
    //         'Content-Type':'application/json',
    //         'Accepts':'application/json'
    //     },
    //     body :JSON.stringify(data)
    // };

    await fetch(url,{
        method:"post",
        headers : {
            'Content-Type':'application/json',
            'Accepts':'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(res=>res.json())
    .then(data=>
        console.log(data)
        );
    })
    
}