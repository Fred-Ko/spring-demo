module.exports = function (plop) {
  plop.setGenerator('domain', {
    description: 'Create a new domain',
    prompts: [
      {
        type: 'input',
        name: 'appName',
        message: 'Enter your application name (e.g. "myapp"):',
        validate: function (value) {
          if (/.+/.test(value)) {
            return true;
          }
          return 'Application name is required';
        },
      },
      {
        type: 'input',
        name: 'domainName',
        message: 'Enter the name of the new domain (e.g., "Product"):',
        validate: function (value) {
          if (/.+/.test(value)) {
            return true;
          }
          return 'Domain name is required';
        },
      },
    ],
    actions: [
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/aggregate/{{domainName}}.java',
        templateFile: 'plop-templates/Aggregate.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/command/Create{{domainName}}Command.java',
        templateFile: 'plop-templates/CreateCommand.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/command/Update{{domainName}}Command.java',
        templateFile: 'plop-templates/UpdateCommand.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/command/Delete{{domainName}}Command.java',
        templateFile: 'plop-templates/DeleteCommand.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/event/{{domainName}}CreatedEvent.java',
        templateFile: 'plop-templates/CreatedEvent.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/event/{{domainName}}UpdatedEvent.java',
        templateFile: 'plop-templates/UpdatedEvent.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/event/{{domainName}}DeletedEvent.java',
        templateFile: 'plop-templates/DeletedEvent.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/repository/{{domainName}}Repository.java',
        templateFile: 'plop-templates/Repository.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/resolver/{{domainName}}Resolver.java',
        templateFile: 'plop-templates/Resolver.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/handler/{{domainName}}CommandHandler.java',
        templateFile: 'plop-templates/CommandHandler.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/handler/{{domainName}}QueryHandler.java',
        templateFile: 'plop-templates/QueryHandler.hbs',
        force: true,
      },
      {
        type: 'add',
        path: 'src/main/java/com/example/{{appName}}/{{domainName}}/util/dummy',
        templateFile: '',
        force: true,
      },
    ],
  });
};
