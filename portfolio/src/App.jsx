import React from "react";
import Land_page from "./components/Land_page";

// Section imports (you’ll create these later)
import TechnicalSkills from "./components/FoE";
import Projects from "./components/Projects";
import Certs_n_expr from "./components/certs_experience";
import Contact from "./components/climax";
import Timeline from "./components/Edtimeline";

function App() {
  return (
    <div className="text-light-slate">
      <Land_page />
      <main className="container mx-auto px-6">
        <Land_page />
        <TechnicalSkills />
        <Timeline />
        <Projects />
        <Certs_n_expr />
        <Contact />
      </main>
      
    </div>
  );
}

export default App;
