import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Load posts using Fetch API
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => this.setState({ posts: data }))
      .catch(error => {
        console.error("Error fetching posts:", error);
        this.setState({ hasError: true });
      });
  }

  // Lifecycle Hook: componentDidMount
  componentDidMount() {
    this.loadPosts();
  }

  // Lifecycle Hook: componentDidCatch
  componentDidCatch(error, info) {
    this.setState({ hasError: true });
    alert("Something went wrong in Posts component.");
    console.error("Caught error:", error, info);
  }

  // Render posts
  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong while loading posts.</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.slice(0, 10).map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
