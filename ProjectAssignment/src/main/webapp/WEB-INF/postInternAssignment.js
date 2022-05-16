async function postInternAssignment0(){
    
    document.getElementById("myform1").addEventListener('submit',async function(event){
         event.preventDefault();
         alert("hi")
         var name=document.getElementById("assignmentname").value;
         console.log(name);
         url1=`http://localhost:8081/ProjectAssignment/getAssignmentName/${name}`
         await fetch(url1).then(response=>response.json())
         .then((data)=>{
            console.log(data);
         });
         
         
         
        })
     
        //  url="http://localhost:8081/ProjectAssignment/createInternAssignment";
     
    //     const url="http://localhost:8081/ProjectAssignment/createInternAssignment";
    //     var internId=document.getElementById("id1").value;
    
    //      var assignmentname=document.getElementById("assignmentname").value
    //        const  url1="http://localhost:8081/ProjectAssignment/getAllAssignments"
    //        const result= fetch(url1)
    //        alert(result[0].assignmentId);
    //        for(var i=0;i<=result.length;i++){
    //         alert("hi")
    //            if(result[i].assignmentName=assignmentname){
    //                var assId=result[i].assignmentId;
    //            }
    //        }
   
    // let data={
    //     internId:internId,
    //     assignmentId:assId

    // };

    // //console.log(data);

    // await fetch(url,{
    //     method:"post",
    //     headers : {
    //         'Content-Type':'application/json',
    //         'Accepts':'application/json'

    //     },
    //     body: JSON.stringify(data)
    // })
    // .then(res=>res.json())
    // .then(data=>{
    //     console.log(data);
    //       //success();
         
    // });
    }


    async function postInternAssignment(){
        var name=document.getElementById("assignmentname").value;
         console.log(name);
         url1=`http://localhost:8081/ProjectAssignment/getAssignmentName/${name}`
         await fetch(url1).then(response=>response.json())
         .then((data)=>{
            console.log(data[0]);
        //     var assId=data[0];
        //  alert(assId)
         });
         
//          for(var i=0;i<=data.length;i++){
//              alert("hi") 
//                if(data[i].assignmentName==name){
//                   var assId=data[i].assignmentId;
//                   console.log(assId);
//  }
//        }
      

    }
