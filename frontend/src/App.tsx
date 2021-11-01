import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (// fragmente (<> </>) , ultilizado para unir as duas tags , pois o return só pode ter um elemento 
    <> 
    <NavBar /> 
    <div className = "container">
      <h1 className="text-primary">Olá mundo</h1>

      <DataTable />
    </div>
    <Footer />
    </>
  );
}

export default App;//dizendo oq vai ficar visivel para outros arquivos
