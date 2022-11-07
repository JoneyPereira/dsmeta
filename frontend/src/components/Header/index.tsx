import logo from '../../assets/img/logo.svg';

import'./styles.css';

function Header() {
    return (

        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.linkedin.com/in/joney-sousa-pereira-347aaa30/"> Joney Sousa</a>
                </p>
            </div>
        </header>

    )
}

export default Header;