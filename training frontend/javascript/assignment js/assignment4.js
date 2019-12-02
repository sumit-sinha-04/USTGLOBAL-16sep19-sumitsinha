// var items=[

//     {item: 'flower',
//     price: 500,
//     use: 'none',
//     },
//     {
//         item:'car',
//         price:200 ,
//         value:'lot'
// },
// {item: 'chair',
// price: 750,
// use:'sit'
// }
// ]

// let num= items.map(function(items){

//     items.price=items.price+50;
//     return items.price;
// })

// console.log(items);

//  let obj=items.map(items=>items.price=items.price+50);
// console.log(items);

// const num=items.filter(function(items){
// if(items.price>500)
// return true;
// else
// return false;
// })
// console.log(num);
// const num=items.filter(items=>
//     items.price>500)
//     console.log(num);



// //string
// let str='my name is khan';

// str1=str.toLowerCase();
// console.log(str1);
// str2=str.toUpperCase();
// console.log(str2);
//     //
//     let str="my name is khan";
//         str1=str.toUpperCase();
//         console.log(str1);
//         str2=str.toLowerCase();
//         console.log(str2);
//         str3=str.charAt(3);
//         console.log(str3);
//         str4=str.indexOf('ab',3);
//         console.log(str4);
//         str5=str.concat(' hello!!');
//         console.log(str5);
//         str6=str.includes('sh',4);
//         console.log(str6);
//         str7=str.replace('psha','abhya');
//         console.log(str7);
//         str8=str.search('abhi');
//         console.log(str8);
//         str9=str.trim();
//         console.log(str9);
//         str10=str.substr(0,4);
//         console.log(str10);
//         str11=str.split('i');
//         console.log(str11);

//         let a1="frontend backend best is weekend";
//         a2=a1.toUpperCase();
//         console.log(a2);
//         a3=a1.toLowerCase();
//         console.log(a3);
//         a4=str.charAt(3);
//         console.log(a4);
//         a5=str.indexOf('ab',3);
//         console.log(a5);
//         a6=str.concat(' hello!!');
//         console.log(a6);
//         a7=str.includes('sh',4);
//         console.log(a7);
//         a8=str.replace('psha','abhya');
//         console.log(a8);
//         a9=str.search('abhi');
//         console.log(a9);
//         a10=str.trim();
//         console.log(a10);
//         a11=str.substr(0,4);
//         console.log(a11);
//         a12=str.split('i');
//         console.log(a12);

//         let b1="I am the best in this world at everything i do";
//         b2=b1.toUpperCase();
//         console.log(b2);
//         b3=b1.toLowerCase();
//         console.log(b3);
//         b4=b1.charAt(3);
//         console.log(b4);
//         b5=b1.indexOf('go',3);
//         console.log(b5);
//         b6=b1.concat(' hello!!');
//         console.log(b6);
//         b7=b1.includes('gi',4);
//         console.log(b7);
//         b8=b1.replace('good','bad');
//         console.log(b8);
//         b9=b1.search('girl');
//         console.log(b9);
//         b10=b1.trim();
//         console.log(b10);
//         b11=b1.substr(0,4);
//         console.log(b11);
//         b12=b1.split('i');
//         console.log(b12);
        

//         let c1="bangalore traffic is worst";
//         c2=c1.toUpperCase();
//         console.log(c2);
//         c3=c1.toLowerCase();
//         console.log(c3);
//         c4=c1.charAt(5);
//         console.log(c4);
//         c5=c1.indexOf('lo',4);
//         console.log(c5);
//         c6=c1.includes('ff',5);
//         console.log(c6);
//         c7=c1.replace('lor','bre');
//         console.log(c7);
//         c8=c1.search('fic');
//         console.log(c8);
//         c9=c1.trim();
//         console.log(c9);
//         c10=c1.substr(0,4);
//         console.log(c10);
//         c11=c1.split('o');
//         console.log(c11);
//         c12=c1.split('o');
//         console.log(c12);


//         let d1="bangalore has only good girls";
//         d2=d1.toUpperCase();
//         console.log(d2);
//         d3=d1.toLowerCase();
//         console.log(d3);
//         d4=d1.charAt(5);
//         console.log(d4);
//         d5=d1.indexOf('lo',4);
//         console.log(d5);
//         d6=d1.includes('ff',5);
//         console.log(d6);
//         d7=d1.replace('lor','bre');
//         console.log(d7);
//         d8=d1.search('fic');
//         console.log(d8);
//         d9=d1.trim();
//         console.log(d9);
//         d10=d1.substr(0,4);
//         console.log(d10);
//         d11=d1.split('o');
//         console.log(d11);
//         d12=d1.split('o');
//         console.log(d12);
//        //by using array method
//        const courses=['javascript','html','css','j2ee','java']
//        const e1=Array.isArray(courses);
//        console.log(e1);
//        const e2=courses.includes('sc',4);
//        console.log(e2);
//        const e3=courses.push('gd','cd');
//        console.log(e3);
//        const e4=courses.unshift('math','td');
//        console.log(e4);
//        const e5=courses.shift();
//        console.log(e5);
//        courses.splice(1,2,'be','bee');
//        console.log(courses);
//        const e6=courses.slice(2,4);
//        console.log(e6);
//        const e7=courses.indexOf('java',3);
//        console.log(e7);
//        const e8=courses.join('-');
//        console.log(e8);

//        const singers=['arijit','arman','tulsi','amaal','sonu']
//        const f1=Array.isArray(singers);
//        console.log(f1);
//        const f2=singers.includes('sunidhi',4);
//        console.log(f2);
//        const f3=singers.push('sherya','monali');
//        console.log(f3);
//        const f4=singers.unshift('anu','arrman');
//        console.log(f4);
//        const f5=singers.shift();
//        console.log(f5);
//        singers.splice(1,2,'bbbb','cccc');
//        console.log(singers);
//        const f6=singers.slice(2,4);
//        console.log(f6);
//        const f7=singers.indexOf('dddd',3);
//        console.log(f7);
//        const f8=singers.join('-');
//        console.log(f8);

//        const crushs=['aaaa','bbbb','cccc','dddd','eeee']
//        const g1=Array.isArray(crushs);
//        console.log(g1);
//        const g2=crushs.includes('ffff',4);
//        console.log(g2);
//        const g3=crushs.push('hhhh','gggg');
//        console.log(g3);
//        const g4=crushs.unshift('jjjj','iiii');
//        console.log(g4);
//        const g5=crushs.shift();
//        console.log(g5);
//        crushs.splice(1,2,'llll','kkkk');
//        console.log(crushs);
//        const g6=crushs.slice(2,4);
//        console.log(g6);
//        const g7=crushs.indexOf('dddd',3);
//        console.log(g7);
//        const g8=courses.join('-');
//        console.log(g8);

//        const songs=['saa','ree','gaa','maa','paa']
//        const h1=Array.isArray(songs);
//        console.log(g1);
//        const h2=songs.includes('naa',4);
//        console.log(h2);
//        const h3=songs.push('dhii','saaaa');
//        console.log(g3);
//        const h4=songs.unshift('siiii','niii');
//        console.log(h4);
//        const h5=songs.shift();
//        console.log(h5);
//        songs.splice(1,2,'liii','miii');
//        console.log(songs);
//        const h6=songs.slice(2,4);
//        console.log(h6);
//        const h7=songs.indexOf('miii',3);
//        console.log(h7);
//        const h8=songs.join('-');
//        console.log(h8);


      
//        const cities=['bangalore','mumbai','bokaro','balasore','bhubaneswar']
//        const i1=Array.isArray(cities);
//        console.log(i1);
//        const i2=cities.includes('rajadhani',4);
//        console.log(i2);
//        const i3=cities.push('vanivihar','saheednagar');
//        console.log(i3);
//        const i4=cities.unshift('kalingavihar','dumduma');
//        console.log(i4);
//        const i5=cities.shift();
//        console.log(i5);
//        cities.splice(1,2,'acaryanagar','patia');
//        console.log(cities);
//        const i6=cities.slice(2,4);
//        console.log(i6);
//        const i7=cities.indexOf('miii',3);
//        console.log(i7);
//        const i8=cities.join('-');
//        console.log(i8);


let hobbies=['shopping','gymming','playing guitar','nesmatics'];

let newp=hobbies.map(function(){

hobbies.splice(0,0,'sumit');
 return hobbies;
} )


console.log(hobbies);
console.log('new');














        

