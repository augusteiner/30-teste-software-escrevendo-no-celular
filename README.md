
# TEC-0030 - Teste de Software

## Componentes do Grupo

- [20152014040014 - José Augusto](https://suap.ifrn.edu.br/edu/aluno/20152014040014/)
- [20152014040006 - Gustavo Guerino](https://suap.ifrn.edu.br/edu/aluno/20152014040006/)

## Plano de Testes para o dojo

[Escrevendo no Celular](http://dojopuzzles.com/problemas/exibe/escrevendo-no-celular/)

## Tecnologias utilizadas

- Java >= 6;
- Maven >= 3.x;
- JUnit >= 4.x;

## Plano de Teste

### Definições

- **&alpha;** = [65, 90] &cup; [97, 122] &cup; [32] &there4; *Conjunto de caracteres ASCII existentes no teclado do celular*
- **ord(char) : int** &there4; *Código ASCII do char fornecido*

| Método           | Entrada           | Condição (teste)   | Classes válidas            | Classes inválidas           |
|------------------|-------------------|--------------------|----------------------------|-----------------------------|
| asciiToGSM       | frase             | tipo(frase)        | tipo(frase) &equals; string      | tipo(frase) &ne; string       |
| asciiToGSM       | frase             | len(frase)         | len(frase) &isin; (0, 255] | len(frase) &notin; (0, 255] |
| asciiToGSM       | frase             | charToGSM(frase[i - 1])[0] | charToGSM(frase[i - 1])[0] &equals; charToGSM(frase[i])[0] | charToGSM(frase[i - 1])[0] &ne; charToGSM(frase[i])[0] |
|                                                                                                                      |
| charToGSM        | char              | tipo(char)         | tipo(char) &equals; char         | tipo(char) &ne; char          |
| charToGSM        | char &isin; frase | ord(char)          | ord(char) &isin; &alpha;   | tipo(char) &notin; &alpha;  |
|                                                                                                                      |

### Protótipos dos métodos

```java
String asciiToGSM(frase)
String charToGSM(caractere)
```

### 1º Caso de Teste

```java
asciiToGSM("a") // NÃO é jogada exceção do tipo IllegalArgumentException
```

### 2º Caso de Teste

```java
asciiToGSM(1) // é jogada exceção do tipo IllegalArgumentException
```

### 3º Caso de Teste

```java
asciiToGSM("b") // NÃO é jogada exceção do tipo IllegalArgumentException
```

### 4º Caso de Teste

```java
asciiToGSM("") // é jogada exceção do tipo IllegalArgumentException
```

### 5º Caso de Teste

```java
asciiToGSM("ab") // o retorno é "1_11"
```

### 6º Caso de Teste

```java
asciiToGSM("ad") // o retorno é "12"
```

### 7º Caso de Teste

```java
charToGSM('a') // NÃO é jogada exceção do tipo IllegalArgumentException
```

### 8º Caso de Teste

```java
charToGSM(1) // é jogada exceção do tipo IllegalArgumentException
```

### 9º Caso de Teste

```java
charToGSM('b') // NÃO é jogada exceção do tipo IllegalArgumentException
```

### 10º Caso de Teste

```java
charToGSM('ç') // é jogada exceção do tipo IllegalArgumentException
```

## Executando os testes

### Pré-requisitos

É necessário ter o java instalado para executar os testes. Para verificar execute o seguinte comando:

```bash
java -version
```

Que deverá ter uma saída similar a:

```
openjdk version "1.8.0_131"
OpenJDK Runtime Environment (build 1.8.0_131-8u131-b11-1~bpo8+1-b11)
OpenJDK 64-Bit Server VM (build 25.131-b11, mixed mode)
```

### Execução dos testes

Em um terminal, na **raiz do projeto** execute o(s) seguinte(s) comando(s):

```bash
./mvnw -q test
```

Que deverá ter uma saída similar a:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
```
