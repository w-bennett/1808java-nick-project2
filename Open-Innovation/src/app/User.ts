export class User {
    username: string;
    password: string;
    role: string;
    email: string;

    constructor(username: string, password: string) {
        this.username = username;
        this.password = password;
    }
}
