// const hobbies=['sleeping','cricket','eating','coding','roaming'];
// console.log(
//     typeof hobbies);
//    const a =Array.isArray(hobbies)
//    console.log(a);
// const b=   hobbies.includes('cricket',1);
// console.log(b);
// const l=hobbies.push('guitar');
// console.log(l);
// let lp= hobbies.pop();
// console.log(lp);

// var nl=hobbies.unshift('numismatics','singing');
// console.log(nl);
// var p=hobbies.shift();
// console.log(p);

// //splice method
// let hobby=['sleeping','cricket','eating','coding','roaming'];
// //hobby.splice(1,2,'birdwatching','pubg');
// console.log(hobby);
// hobby.splice(0,0,'birdwatching','pubg');
// console.log(hobby);

// //slice method
// let naya= hobby.splice(1,3);
// console.log(naya);
// //other funct
// let hobbee=['sleeping','cricket','eating','coding','roaming'];
// let indy=hobbee.indexOf('coding',1);
// console.log(indy);
// let nString=hobbee.join('->');
// console.log(nString);
//  const numbers=[100,200,300,400];
//  const numbers1=numbers.map(function(value){
//      let newValue=value+50;
//      return newValue;
//  });
//  console.log(numbers1);
// const num2= numbers.map(value=>value+50)
// console.log(num2); 

// const filternum=numbers.filter(function(value,index){
//     if(value>200)
//     return true;
//     else
//     return false;

// })
// console.log(filternum);
//  let to=numbers.filter(value=>value>200)
// console.log(to)


// // map method
// var items=
// [

// ]

const hobbies=['sleeping','cricket','eating','coding','roaming'];
let num=hobbies.slice(1,2,'sumit');
for(let i=0;i<num.length;i++)
console.log(num[i]);
