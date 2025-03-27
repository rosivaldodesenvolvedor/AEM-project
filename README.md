# AEM-project

Projeto voltado para o desenvolvimento e aprimoramento de habilidades técnicas em Adobe Experience Manager (AEM), com foco na aplicação prática de conceitos como criação de componentes, templates, estruturas de conteúdo e integração com outras tecnologias web.

## Configuração do Ambiente de Desenvolvimento

Abaixo estão os passos necessários para configurar o ambiente de desenvolvimento do projeto:

1. **Instalação do Java JDK 11 (versão 11.0.25)**  
   Essencial para compilar e executar aplicações baseadas em Java.

2. **Instalação do Apache Maven (versão 3.9.9)**  
   Utilizado para gerenciamento de dependências e automação de builds do projeto.

3. **Instalação do AEM SDK**  
   Ferramenta necessária para desenvolvimento e execução de projetos com Adobe Experience Manager (AEM).

4. **Instalação do Node.js**  
   Necessário para executar scripts e ferramentas de frontend, como gerenciamento de pacotes com npm/yarn e build de assets.

5. **Instalação do Git**  
   Controle de versão para gerenciar o código-fonte e colaborar com outros desenvolvedores.


## Criação do Projeto AEM

A estrutura inicial do projeto foi gerada utilizando o **AEM Project Archetype** da Adobe, por meio do seguinte comando Maven:

```bash
mvn -B org.apache.maven.plugins:maven-archetype-plugin:3.2.1:generate \
 -D archetypeGroupId=com.adobe.aem \
 -D archetypeArtifactId=aem-project-archetype \
 -D archetypeVersion=45 \
 -D appTitle="Rosivaldo" \
 -D appId="rosivaldo" \
 -D groupId="com.rosivaldo"

```

## Instalação do Dispatcher
A instalação do AEM Dispatcher foi realizada seguindo os passos descritos na documentação oficial da Adobe https://experienceleague.adobe.com/en/docs/experience-manager-learn/cloud-service/local-development-environment-set-up/dispatcher-tools. O Dispatcher foi configurado para otimizar a performance e segurança do ambiente AEM.
