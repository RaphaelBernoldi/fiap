const ethereumService = require('../../services/EthereumService');

module.exports = (req, res) => {

    ethereumService.createMessage('Vai la')
    res
    .status(200)
    .json('Criado com sucesso');
}