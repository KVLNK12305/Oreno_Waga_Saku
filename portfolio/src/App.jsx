const { useState, useEffect, useRef } = React;

        // --- ICONS (Inline SVG) ---
        const GitHubIcon = () => (
            <svg xmlns="http://www.w3.org/2000/svg" role="img" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round" className="h-5 w-5 transition-colors duration-300">
                <title>GitHub</title>
                <path d="M9 19c-5 1.5-5-2.5-7-3m14 6v-3.87a3.37 3.37 0 0 0-.94-2.61c3.14-.35 6.44-1.54 6.44-7A5.44 5.44 0 0 0 20 4.77 5.07 5.07 0 0 0 19.91 1S18.73.65 16 2.48a13.38 13.38 0 0 0-7 0C6.27.65 5.09 1 5.09 1A5.07 5.07 0 0 0 5 4.77a5.44 5.44 0 0 0-1.5 3.78c0 5.42 3.3 6.61 6.44 7A3.37 3.37 0 0 0 9 18.13V22"></path>
            </svg>
        );

        // --- NAVIGATION ---
        const Header = () => {
            const navLinks = [
                { name: "Skills", href: "#skills" },
                { name: "Experience", href: "#experience" },
                { name: "Projects", href: "#projects" },
                { name: "Publications", href: "#publications" },
                { name: "Contact", href: "#contact" },
            ];

            return (
                <header className="fixed top-0 left-0 right-0 z-50 bg-navy/80 backdrop-blur-sm">
                    <div className="container mx-auto px-6 py-4 flex justify-between items-center">
                        <a href="#home" className="text-2xl font-bold text-gold tracking-widest">
                            KVLNK
                        </a>
                        <nav className="hidden md:flex items-center space-x-8">
                            {navLinks.map((link, i) => (
                                <a key={link.name} href={link.href} className="text-light-slate hover:text-gold transition-colors duration-300 group">
                                    <span className="text-gold font-mono mr-1">0{i+1}.</span>{link.name}
                                    <span className="block max-w-0 group-hover:max-w-full transition-all duration-500 h-0.5 bg-purple-glow"></span>
                                </a>
                            ))}
                        </nav>
                        <button className="md:hidden text-gold">
                            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" strokeWidth={1.5} stroke="currentColor" className="w-6 h-6">
                                <path strokeLinecap="round" strokeLinejoin="round" d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5" />
                            </svg>
                        </button>
                    </div>
                </header>
            );
        };