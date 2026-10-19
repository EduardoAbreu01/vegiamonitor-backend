# -----------------------------------------------------------------------------
# Estágio 1: Build (Compilação do projeto com Maven)
# -----------------------------------------------------------------------------
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copia primeiro o pom.xml para aproveitar o cache de dependências do Docker
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código-fonte do projeto
COPY src ./src

# Compila a aplicação e gera o pacote .jar ignorando os testes no build
RUN mvn clean package -DskipTests

# -----------------------------------------------------------------------------
# Estágio 2: Runtime (Execução em imagem leve de produção)
# -----------------------------------------------------------------------------
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Cria um utilizador não-root por motivos de segurança
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Copia o JAR compilado do estágio de build
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão
EXPOSE 8080

# Executa a aplicação mapeando a porta dinâmica atribuída pelo Render
ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar app.jar"]