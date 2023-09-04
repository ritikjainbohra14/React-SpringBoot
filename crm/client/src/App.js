import logo from './logo.svg';
import './App.css';
import Contacts from './componenets/Contacts';

function App() {
  return (
    <div className="container-fluid">
      <nav>
       <div className='nav-rapper center-align'>
          <a href='/' className='brand-logo'>Contacts</a>
        </div> 
      </nav>
      <div className='row'>
      <Contacts />
      </div>
        
    </div>
  );
}

export default App;
