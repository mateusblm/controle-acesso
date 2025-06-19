🔁 Endpoints da API
Método	Rota	Descrição
POST	/usuarios/create/{nome}/{tipoGrupo}	Cria um novo usuário
GET	/usuarios/list/{tipoGrupo}	Lista o primeiro usuário do grupo

Exemplo com Postman:
Criar usuário:

POST http://localhost:8080/usuarios/create/joao/CAS_ADM

Listar usuário por grupo:

GET http://localhost:8080/usuarios/list/CAS_USER