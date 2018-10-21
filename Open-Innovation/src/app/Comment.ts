export class Comment {
    commentid: number;
    articleid: number;
    username: string;
    role: string;
    body: string;
    upvotes: number;
    downvotes: number;
    stars: number;

    constructor(articleId: number, username: string, role: string, body: string) {
        this.commentid = 1;
        this.articleid = articleId;
        this.username = username;
        this.role = role;
        this.body = body;
        this.upvotes = 0;
        this.downvotes = 0;
        this.stars = 0;
    }
}
