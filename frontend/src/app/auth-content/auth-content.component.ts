import { AxiosService } from '../core/http-client/axios.service';
import { Component } from '@angular/core';


@Component({
  selector: 'app-auth-content',
  templateUrl: './auth-content.component.html',
  styleUrls: ['./auth-content.component.scss'],
})
export class AuthContentComponent {
  data: string[] = [];

  constructor(private axiosService: AxiosService) {}

  ngOnInit(): void {
    this.axiosService
      .request('GET', '/messages', {})
      .then((response) => {
        this.data = response.data;
      })
  }
}
