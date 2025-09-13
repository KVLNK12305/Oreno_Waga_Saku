import React from "react";
import Land_page from "./components/Land_page";

// Section imports (you’ll create these later)
import FoE from "./components/FoE";
import Projects from "./components/Projects";
import CertsExperience from "./components/certs_experience";
import Climax from "./components/climax";
import EdTimeline from "./components/Edtimeline";
import Land_page from "./components/Land_page";

function App() {
  return (
    <div className="text-light-slate">
      <Land_page />
      <main className="container mx-auto px-6">
        <Land_page />
        <FoE />
        <EdTimeline />
        <Projects />
        <CertsExperience />
        <Climax />
      </main>
      
    </div>
  );
}

export default App;
