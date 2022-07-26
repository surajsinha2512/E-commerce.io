import React from 'react'
import Grid from '@mui/material/Grid';
import Paper from '@mui/material/Paper';
import Avatar from '@mui/material/Avatar';
import LockIcon from '@mui/icons-material/Lock';
import TextField from '@mui/material/TextField';
import {FormGroup, Typography} from '@mui/material';
import {FormControlLabel}from '@mui/material';
import {Checkbox} from '@mui/material';
import {Button,Link} from '@mui/material';
const Login=({handleChange})=>{
    const paperStyle={padding:20,height :'70vh',width :300,margin:'0'}
    const avtstyle={backgroundColor:'rgb(15 155 66)'}
    const btstyle={margin:'10px 0',backgroundColor:'#39c06b'}
    const psstyle={margin:'15px 0'}
    return(
        <Grid>
            <Paper elevation={10} style={paperStyle}>
            <Grid align='center'>
            <Avatar style={avtstyle}><LockIcon/></Avatar>
            <h2>Log In</h2>
            </Grid>
            
            <TextField
             required
             id="outlined-required"
             label="Username"
             fullWidth
            />
            <TextField
             required id="outlined-required" label="Password" type='password' style={psstyle} fullWidth/>
            <FormGroup>
            <FormControlLabel control={<Checkbox sx={{ '& .MuiSvgIcon-root': { fontSize: 20 } }}/>} label="Remember me" />
            </FormGroup>
            <Button variant="contained" type='submit' style={btstyle} fullWidth>Log In</Button>
            <Typography>
                <Link href="#">Forgot password?</Link>
            </Typography>
            <Typography> Don't have an account?
                <Link href="#" onClick={()=>handleChange("event",1)}>Sign Up</Link>
            </Typography>
            
            
            </Paper>
        </Grid>
    )
}
export default Login;