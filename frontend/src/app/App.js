import React from 'react';
import reactLogo from '../logo.svg';
import springBootLogo from '../spring-boot-logo.png';
import './App.css';
import FileImage from "../components/FileImage";

function App() {
  return (
    <div className="App">
        <header className="App-header">
            <img src={reactLogo} className="App-logo" alt="reactLogo" />
            <img src={springBootLogo} className="App-logo" alt="springBootLogo" />
            <h1 className="App-title">Простая загрузка и выгрузка файлов с Spring Boot & React</h1>
        </header>
        <FileImage/>
    </div>
  );
}

export default App;
