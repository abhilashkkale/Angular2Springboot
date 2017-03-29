import { Angular2SpringbootPage } from './app.po';

describe('angular2-springboot App', () => {
  let page: Angular2SpringbootPage;

  beforeEach(() => {
    page = new Angular2SpringbootPage();
  });


  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
