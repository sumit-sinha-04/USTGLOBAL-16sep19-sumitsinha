console.log('window object',window);
console.log('this keyword',this);
console.log(this===window);
// window.alert('welcome to js class');
// alert('bomb is in the class!!!!!!!!');
 // let confirmdelete = confirm('are you sure you want to quit!!!!');
 // console.log('confirmdelete', confirmdelete);

//  let username=prompt('what is your name','su(mit');
//  console.log('username',username);

 const person={
firstname:'sumit',
age:21,
lastname:'sinha',
getName:function(){
    console.log(this);
return this.firstname+' '+this.lastname
}
 }

 let fullname=person.getName();
 console.log('fullname is :',fullname);