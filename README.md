# Study APIR

API de estudo de Spring Boot.

## Instruções de uso

```
mvn spring-boot:run

javac Demo1.java  - para compilar no java - coloca no terminal
Nesse Demo1 - coloca o nome do projeto. 


Java Demo1   - para executar - coloca no terminal
```



| Anotação          | Função            | Descrição                                                                 |
|------------------|------------------|---------------------------------------------------------------------------|
| `@RestController` | Criar API        | Define a classe como um controller REST que retorna dados (JSON/String)  |
| `@RequestMapping` | Rota base        | Define o caminho principal da API (ex: `/produtos`)                      |
| `@PostMapping`    | Criar recurso    | Usado para enviar dados e criar um novo registro                         |
| `@GetMapping`     | Buscar dados     | Recupera informações (um ou vários registros)                            |
| `@PutMapping`     | Atualizar        | Atualiza um recurso existente                                            |
| `@DeleteMapping`  | Deletar          | Remove um recurso existente    