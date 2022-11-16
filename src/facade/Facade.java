package facade;

public class Facade {
    AuthenticationService authenticationService;
    AuthorizationService authorizationService;
    Database database;

    public Facade(AuthenticationService authenticationService, AuthorizationService authorizationService, Database database) {
        this.authenticationService = authenticationService;
        this.authorizationService = authorizationService;
        this.database = database;
    }

    public void executeQuery(String query){
        authenticationService.checkAuthentication();
        authorizationService.checkAuthorization();
        database.executeQuery(query);
    }
}
