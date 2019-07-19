import React, { Component } from "react";

import "./MainHeaderSearch.scss"


class MainHeaderSearch extends Component {
    render() {
        return (
            <span className="main-search">
                <input className="search-area" type="text" />
                <span className="search-icon">
                    <button type="button" />
                </span>
            </span>
        );
    }
}

export default MainHeaderSearch;