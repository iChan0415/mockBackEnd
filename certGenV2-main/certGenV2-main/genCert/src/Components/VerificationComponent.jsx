import React, { useState, useEffect } from 'react';

const VerificationComponent = () => {
    const [serialNumber, setSerialNumber] = useState('');
    const [verificationData, setVerificationData] = useState(null);
    const [error, setError] = useState(null);

    useEffect(() => {
        // This effect runs when verificationData changes
        console.log("Updated Verification Data:", verificationData);
    }, [verificationData]); // Run the effect when verificationData changes

    const handleSerialNumberChange = (event) => {
        setSerialNumber(event.target.value);
    };

    const handleVerifyClick = () => {
        fetch(`http://localhost:8080/api/certifications/verify/${serialNumber}`)
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            setVerificationData(data);
            setError(null);
        })
        .catch(error => {
            setVerificationData(null);
            setError('Certification not found');
            console.error('Error fetching verification data:', error);
        });
    };

    return (
        <div>
            <label>
                Serial Number:
                <input type="text" value={serialNumber} onChange={handleSerialNumberChange} />
            </label>
            <button onClick={handleVerifyClick}>Verify</button>

            {verificationData && (
                <div>
                    <h2>Verification Data:</h2>
                    <p>Course Title: {verificationData[0].course_title}</p>
                    <p>Serial Number: {verificationData[0].serial_no}</p>
                    <p>Full Name: {verificationData[0].full_name}</p>
                </div>
            )}

            {error && (
                <div>
                    <p>{error}</p>
                </div>
            )}
        </div>
    );
};

export default VerificationComponent;
