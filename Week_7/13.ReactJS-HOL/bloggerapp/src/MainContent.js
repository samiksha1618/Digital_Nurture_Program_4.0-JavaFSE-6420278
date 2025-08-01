import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function MainContent() {
  const [view, setView] = useState('book'); // book | blog | course | none

  // Conditional rendering using if-else
  let content;
  if (view === 'book') {
    content = <BookDetails />;
  } else if (view === 'blog') {
    content = <BlogDetails />;
  } else if (view === 'course') {
    content = <CourseDetails />;
  } else {
    content = <p>Please select an option above.</p>;
  }

  return (
    <div>
      <h1>Blogger Dashboard</h1>
      <div>
        <button onClick={() => setView('book')}>Show Book</button>
        <button onClick={() => setView('blog')}>Show Blog</button>
        <button onClick={() => setView('course')}>Show Course</button>
        <button onClick={() => setView('none')}>Clear</button>
      </div>
      <hr />
      {/* Different ways to render conditionally */}
      {content}
    </div>
  );
}

export default MainContent;
