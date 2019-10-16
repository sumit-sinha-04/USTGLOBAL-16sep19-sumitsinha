import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  news;
  
  constructor(private http:HttpClient) {
    this.getNews();
   }

  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=0167130abcc84a7b96c87594c6f46dda').subscribe(data =>{
         this.news = data.articles;   
         console.log(data);
          },err=>{
            console.log(err);
          },()=>{
            console.log("Subscribed Sucessfuly");
          });
  }

  ngOnInit() {
  }

}
