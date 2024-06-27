import React, { useState } from 'react';
import './App.css';
import BookList from './components/BookList';
import LoginForm from './components/LoginForm';

function App() {
  const [token, setToken] = useState(localStorage.getItem('token'));

  const handleLogin = (newToken) => {
    setToken(newToken);
  };

  return (
    <div className="App">
      {token ? (
        <BookList />
      ) : (
        <LoginForm onLogin={handleLogin} />
      )}
    </div>
  );
}

export default App;
