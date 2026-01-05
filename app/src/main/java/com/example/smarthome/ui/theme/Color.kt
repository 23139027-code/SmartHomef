package com.example.smarthome.ui.theme

import androidx.compose.ui.graphics.Color

// ====================================================================
// Smart Home V3.3 - LIGHT PROFESSIONAL THEME
// Clean light theme matching web interface
// ====================================================================

// Background Colors
val LightBackground = Color(0xFFFAFAFA)     // Light grey background
val WhiteSurface = Color.White              // White cards/surfaces
val DarkSidebar = Color(0xFF2C3E50)         // Dark blue-grey sidebar (matching web)

// Primary Colors
val ElectricBlue = Color(0xFF007BFF)        // Active state (ON) - Bright blue
val BlueGrey = Color(0xFF6C757D)            // Inactive state (OFF) - Grey

// Text Colors
val TextDark = Color(0xFF2C3E50)            // Primary text (dark)
val TextGrey = Color(0xFF6C757D)            // Secondary text/labels

// Status Colors
val SuccessGreen = Color(0xFF4CAF50)        // Connected/Success
val WarningAmber = Color(0xFFFF9800)        // Warning
val ErrorRed = Color(0xFFF44336)            // Error/Danger

// Sensor Colors (for Charts)
val TemperatureColor = Color(0xFFFF6B6B)    // Warm red
val HumidityColor = Color(0xFF4ECDC4)       // Cyan
val LightColor = Color(0xFFFFD93D)          // Yellow

// Overlay/Divider
val DividerColor = Color(0xFF263238)        // Subtle divider
val OverlayColor = Color(0x33000000)        // 20% black overlay

// ====================================================================
// ALIASES FOR COMPATIBILITY (Required by MainScreen & SettingsScreen)
// ====================================================================
val BgColor = LightBackground                // Background alias (light grey)
val SurfaceColor = WhiteSurface              // Surface alias (white)
val TextPrimary = TextDark                   // Primary text alias (dark)
val PrimaryBlue = ElectricBlue               // Primary color alias

// ====================================================================
// BACKWARD COMPATIBILITY - Old color names (for existing screens)
// ====================================================================
val DeepDarkBlue = LightBackground           // Maps to light background
val DarkNavyBlue = WhiteSurface              // Maps to white surface
val TextWhite = TextDark                     // Maps to dark text for light theme

