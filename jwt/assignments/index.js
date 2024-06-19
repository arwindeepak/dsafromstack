const jwt = require("jsonwebtoken");
const zod = require("zod");
const jwtPassword = "secret";

const emailSchema = zod.string().email();
const passswordSchema = zod.string().min(6);
function Verify(username, password) {
  const userName = emailSchema.safeParse(username);
  const passswordschema = passswordSchema.safeParse(password);

  if (!userName.success || !passswordschema.success) {
    return null;
  }

  const token = jwt.sign({ username }, jwtPassword);
  return token;
}

// function Decode(token) {
//     const decode = jwt.decode(token);
//     if (decode) {
//         return true;
//     } else {
//         return false;
//     }
// }
function Verify1(token) {
    let ans = true;
    try {
        jwt.verify(token, jwtPassword);
        return ans;
  
    } catch (error) {
        ans=false
    }
    return ans;
   
}
const ans = Verify("harkiat@gmail.com", "abbwdbwd");
console.log(ans);
// const dec = Decode(ans);
// console.log(dec);
const ver = Verify1(ans);
console.log(ver);
