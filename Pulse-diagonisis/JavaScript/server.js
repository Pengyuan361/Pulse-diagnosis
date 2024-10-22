// // server.js
// const express = require('express');
// const fetch = require('node-fetch');
// const app = express();

// app.use(express.json());

// app.post('/api/getDiagnosis', async (req, res) => {
//     const userInput = req.body.userInput;
//     const apiKey = 'sk-dVSYtYhc50Q7GsGmzpJGH2ANjXFMNOhUKNlg8aa2V247lbsL'; // 安全地存储您的 API 密钥，例如使用环境变量
//     const apiUrl = 'https://api.moonshot.cn/v1/chat/completions';

//     const data = {
//         model: 'https://api.moonshot.cn/v1/models',
//         messages: [
//             { role: 'user', content: `用户的脉搏数据是：${userInput}\n请根据脉搏数据给出诊断意见。` }
//         ],
//         max_tokens: 150,
//         temperature: 0.7,
//     };

//     try {
//         const response = await fetch(apiUrl, {
//             method: 'POST',
//             headers: {
//                 'Content-Type': 'application/json',
//                 'Authorization': `Bearer ${apiKey}`,
//             },
//             body: JSON.stringify(data),
//         });
//         const result = await response.json();
//         if (result.choices && result.choices.length > 0) {
//             res.json({ diagnosis: result.choices[0].message.content.trim() });
//         } else {
//             res.status(500).json({ error: 'Invalid API response' });
//         }
//     } catch (error) {
//         console.error('Error calling the API:', error);
//         res.status(500).json({ error: 'Error calling the API' });
//     }
// });

// app.listen(3000, () => {
//     console.log('Server is running on port 3000');
// });
