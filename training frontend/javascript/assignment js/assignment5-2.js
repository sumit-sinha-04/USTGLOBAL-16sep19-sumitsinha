function myfunk()
{
    let nameLength=document.getElementById("user").value;
    let passLength=document.getElementById("pass").value;
   let login= document.getElementById("logy");
    if(nameLength.length>5 &&  passLength.length>6)
    {
 login.disabled = false;
    }
    
    else{
    login.disabled = true;
}
}