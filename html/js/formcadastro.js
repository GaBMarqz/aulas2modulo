const modal = document.querySelector('.modal-container')
const tbody = document.querySelector('tbody')
const sNome = document.querySelector('#m-nome')
const sFuncao = document.querySelector('#m-funcao')
const sSalario = document.querySelector('#m-salario')
const btnSalvar = document.querySelector('#btnSalvar')

let itens
let id

function openModal(edit = false, index = 0){
    modal.classList.add('activate')
    
    modal.onclick = e => {
        if(e.target.className.indexOf('modal-container') !== -1) {
            modal.classList.remove('activate')

        }
    }
    if(edit){
        sNome.value = itens[index].nome
        sFuncao.value = itens[index].funcao
        sSalario.value = itens[index].salario
        id = index
    }else{
        sNome.value=''
        sFuncao.value=''
        sSalario.value=''
    }
}

function editItem(index){
    openModal(true, index)

}

function deleteItem(item, index){
    let tr = document.createElement('tr')

    tr.innerHtml = `
        <th>${item.nome}</th>
        <th>${item.funcao}</th>
        <th>${item.salario}</th>
        <th class="acao">
            <button onclick="editItem(${index})"><i class='bx bx-edit'></i></button>
        </th>
    `
    tbody.appendChild(tr)
}

btnSalvar.onclick = e => {
    if(sNome.value == '' || sFuncao.value == '' || sSalario.value == ''){
        return
    }

    e.preventDefault();

    if(id !== undefined){
        itens[id].nome = sNome.value
        itens[id].funcao = sFuncao.value
        itens[id].salario = sSalario.value
    }else{
        itens.push({'nome': sNome.value, 'funcao': sFuncao.value, 'salario': sSalario.value})
    }

    setItensBD()

    modal.classList.remove('activate')
    loadItens()
    id = undefined
}

function loadItens(){
    itens = getItensBD()
    tbody.innerHTML = ''
    itens.forEach((item, index) => {
        insertItem(item, index)
    })
}

const getItensBD = () => JSON.parse(localStorage.getItem('dbfunc')) ?? []
const setItensBD = () => localStorage.setItem('dbfunc', JSON.stringify(itens))

loadItens()