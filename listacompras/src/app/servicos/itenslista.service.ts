import { environment } from './../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ItemLista } from '../model/ItemLista';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItenslistaService {

  constructor(private http: HttpClient) {
   }

   public adicionarNovoItem(item: ItemLista): Observable<ItemLista>{
    return this.http.post<ItemLista>(environment.urlAPI+"/itemlista",item);
   }
}
