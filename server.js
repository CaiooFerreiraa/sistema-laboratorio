import express from 'express'
import path from 'path'
import router from './routes.js';

const app = express();

app.set('views', path.resolve('src', 'views'));
app.set('view engine', 'ejs');

//app.use(csrf());

//app.use(createCsrf);
//app.use(checkCsrfError);
app.use(router);

app.listen(8080, () => console.log("Servidor rodando na " + "http://localhost:8080"))