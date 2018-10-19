export class Comment {
    articleId: number;
    username: string;
    role: string;
    upvotes: number;
    downvotes: number;
    stars: number;
    body: string;

    constructor(articleId: number, username: string, role: string, body: string) {
        this.articleId = articleId;
        this.username = username;
        this.role = role;
        this.body = body;
        this.upvotes = 0;
        this.downvotes = 0;
        this.stars = 0;
    }
}
