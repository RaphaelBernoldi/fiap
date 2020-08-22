const ethereumService = require('../../services/EthereumService');

module.exports = (req, res)  => {

    ethereumService
        .connect()
    ethereumService
        .listAllMessage()

    res
    .status(200)
    .json([
        {
            "name": "string",
            "message": "string",
            "image-url": "string"
        }
    ]);

    
}