import React from "react";
import {Formik, Form, Field, ErrorMessage} from "formik";
import * as Yup from "yup";
import {Button, TextField, Typography, Container, CssBaseline} from "@mui/material";
import {useNavigate} from "react-router-dom";
import {useDispatch} from "react-redux";
import {registerUser} from "../Redux/Auth/action";

//Import Navbar
import Navbar from "../Customer/pages/Navbar/Navbar";

const initialValues = {
    fullName: "",
    email: "",
    password: "",
    role: "CUSTOMER",
};

const validationSchema = Yup.object({
    fullName: Yup.string().required("Full Name is required"),
    email: Yup.string().email("Invalid email format").required("Email is required"),
    password: Yup.string().min(6, "Password must be at least 6 characters").required("Password is required"),
    role: Yup.string().required("Type is required"),
});

const RegistrationForm = () => {
    const dispatch = useDispatch();
    const navigate = useNavigate();

    const handleSubmit = (values) => {
        console.log("Form values: - ", values);
        values.username = values.email.split("@")[0];
        dispatch(registerUser({userData: values, navigate}));
    };

    return (
        <>
            {/* Navbar at the top */}
            <Navbar />

            <Container component="main" maxWidth="xs" sx={{mt: 12}}>
                <CssBaseline />
                <div>
                    <Typography className="text-center" variant="h5">
                        Register
                    </Typography>

                    <Formik initialValues={initialValues} validationSchema={validationSchema} onSubmit={handleSubmit}>
                        <Form>
                            <Field
                                as={TextField}
                                variant="outlined"
                                margin="normal"
                                fullWidth
                                label="Full Name"
                                name="fullName"
                                id="fullName"
                                autoComplete="fullName"
                                helperText={<ErrorMessage name="fullName" />}
                            />
                            <Field
                                as={TextField}
                                variant="outlined"
                                margin="normal"
                                fullWidth
                                label="Email Address"
                                name="email"
                                id="email"
                                autoComplete="email"
                                helperText={<ErrorMessage name="email" />}
                            />
                            <Field
                                as={TextField}
                                variant="outlined"
                                margin="normal"
                                fullWidth
                                label="Password"
                                name="password"
                                type="password"
                                id="password"
                                helperText={<ErrorMessage name="password" />}
                            />

                            <Button
                                type="submit"
                                fullWidth
                                variant="contained"
                                color="primary"
                                sx={{mt: 3, py: ".8rem"}}
                            >
                                Register
                            </Button>
                        </Form>
                    </Formik>

                    <Typography variant="body2" align="center" sx={{mt: 3}}>
                        Already have an account? <Button onClick={() => navigate("/login")}>Login</Button>
                    </Typography>
                </div>
            </Container>
        </>
    );
};

export default RegistrationForm;
