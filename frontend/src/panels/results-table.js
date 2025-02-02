let parentEl;
let selectedRow = null;

const initResultsTable = config => {
    parentEl = config.queryResultsDiv;
};

const buildTable = (variables, rows, prefixes, onRowSelected) => {
    console.log("Rows: ", rows);
    while (parentEl.firstChild) parentEl.removeChild(parentEl.lastChild);
    let table = document.createElement('table');
    table.setAttribute("id", "queryResultsTable");
    let tr = document.createElement('tr');
    variables.forEach(col => {
        let th = document.createElement('th');
        let text = document.createTextNode("?" + col.value);
        th.appendChild(text);
        tr.appendChild(th);
    });
    table.appendChild(tr);
    rows.forEach(row => {
        tr = document.createElement('tr');
        row.tr = tr;
        variables.forEach(col => {
            let cell = row.get(col.value);

            let td = document.createElement('td');
            td.classList.add("Variable");
            let text = document.createTextNode(cell);

            td.appendChild(text);
            tr.appendChild(td);
        });
        tr.addEventListener("click", () => {
            selectedRow && selectedRow.tr.classList.remove("selectedRow");
            if (row === selectedRow) {
                selectedRow = null;
            } else {
                selectedRow = row;
                row.tr.classList.add("selectedRow");
            }
            onRowSelected(selectedRow);
        });
        table.appendChild(tr);
    });
    parentEl.appendChild(table);
};

export { initResultsTable, buildTable }
