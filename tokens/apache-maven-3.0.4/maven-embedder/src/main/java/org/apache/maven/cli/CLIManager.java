package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CommandLine	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
CommandLineParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
GnuParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
HelpFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
OptionBuilder	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
Options	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
cli	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CLIManager	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
ALTERNATE_POM_FILE	TokenNameIdentifier
=	TokenNameEQUAL
'f'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
BATCH_MODE	TokenNameIdentifier
=	TokenNameEQUAL
'B'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
SET_SYSTEM_PROPERTY	TokenNameIdentifier
=	TokenNameEQUAL
'D'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
OFFLINE	TokenNameIdentifier
=	TokenNameEQUAL
'o'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
QUIET	TokenNameIdentifier
=	TokenNameEQUAL
'q'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
DEBUG	TokenNameIdentifier
=	TokenNameEQUAL
'X'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
ERRORS	TokenNameIdentifier
=	TokenNameEQUAL
'e'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
HELP	TokenNameIdentifier
=	TokenNameEQUAL
'h'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
VERSION	TokenNameIdentifier
=	TokenNameEQUAL
'v'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
SHOW_VERSION	TokenNameIdentifier
=	TokenNameEQUAL
'V'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
NON_RECURSIVE	TokenNameIdentifier
=	TokenNameEQUAL
'N'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
UPDATE_SNAPSHOTS	TokenNameIdentifier
=	TokenNameEQUAL
'U'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
ACTIVATE_PROFILES	TokenNameIdentifier
=	TokenNameEQUAL
'P'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SUPRESS_SNAPSHOT_UPDATES	TokenNameIdentifier
=	TokenNameEQUAL
"nsu"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
CHECKSUM_FAILURE_POLICY	TokenNameIdentifier
=	TokenNameEQUAL
'C'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
CHECKSUM_WARNING_POLICY	TokenNameIdentifier
=	TokenNameEQUAL
'c'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
ALTERNATE_USER_SETTINGS	TokenNameIdentifier
=	TokenNameEQUAL
's'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ALTERNATE_GLOBAL_SETTINGS	TokenNameIdentifier
=	TokenNameEQUAL
"gs"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
char	TokenNamechar
ALTERNATE_USER_TOOLCHAINS	TokenNameIdentifier
=	TokenNameEQUAL
't'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
FAIL_FAST	TokenNameIdentifier
=	TokenNameEQUAL
"ff"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
FAIL_AT_END	TokenNameIdentifier
=	TokenNameEQUAL
"fae"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
FAIL_NEVER	TokenNameIdentifier
=	TokenNameEQUAL
"fn"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RESUME_FROM	TokenNameIdentifier
=	TokenNameEQUAL
"rf"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROJECT_LIST	TokenNameIdentifier
=	TokenNameEQUAL
"pl"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ALSO_MAKE	TokenNameIdentifier
=	TokenNameEQUAL
"am"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ALSO_MAKE_DEPENDENTS	TokenNameIdentifier
=	TokenNameEQUAL
"amd"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
LOG_FILE	TokenNameIdentifier
=	TokenNameEQUAL
"l"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ENCRYPT_MASTER_PASSWORD	TokenNameIdentifier
=	TokenNameEQUAL
"emp"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
ENCRYPT_PASSWORD	TokenNameIdentifier
=	TokenNameEQUAL
"ep"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
THREADS	TokenNameIdentifier
=	TokenNameEQUAL
"T"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
Options	TokenNameIdentifier
options	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"static-access"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
CLIManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
options	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Options	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"help"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Display help information"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
HELP	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"file"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Force the use of an alternate POM file."	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALTERNATE_POM_FILE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"define"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Define a system property"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
SET_SYSTEM_PROPERTY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"offline"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Work offline"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
OFFLINE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"version"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Display version information"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
VERSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"quiet"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Quiet output - only show errors"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
QUIET	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"debug"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Produce execution debug output"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"errors"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Produce execution error messages"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ERRORS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"non-recursive"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Do not recurse into sub-projects"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
NON_RECURSIVE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"update-snapshots"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Forces a check for updated releases and snapshots on remote repositories"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
UPDATE_SNAPSHOTS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"activate-profiles"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Comma-delimited list of profiles to activate"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ACTIVATE_PROFILES	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"batch-mode"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Run in non-interactive (batch) mode"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
BATCH_MODE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"no-snapshot-updates"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Suppress SNAPSHOT updates"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
SUPRESS_SNAPSHOT_UPDATES	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"strict-checksums"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Fail the build if checksums don't match"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
CHECKSUM_FAILURE_POLICY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"lax-checksums"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Warn if checksums don't match"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
CHECKSUM_WARNING_POLICY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"settings"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Alternate path for the user settings file"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALTERNATE_USER_SETTINGS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"global-settings"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Alternate path for the global settings file"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALTERNATE_GLOBAL_SETTINGS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"toolchains"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Alternate path for the user toolchains file"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALTERNATE_USER_TOOLCHAINS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"fail-fast"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Stop at first failure in reactorized builds"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
FAIL_FAST	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"fail-at-end"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Only fail the build afterwards; allow all non-impacted builds to continue"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
FAIL_AT_END	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"fail-never"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"NEVER fail the build, regardless of project result"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
FAIL_NEVER	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"resume-from"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Resume reactor from specified project"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
RESUME_FROM	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"projects"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Comma-delimited list of specified reactor projects to build instead of all projects. A project can be specified by [groupId]:artifactId or by its relative path."	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
PROJECT_LIST	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"also-make"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"If project list is specified, also build projects required by the list"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALSO_MAKE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"also-make-dependents"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"If project list is specified, also build projects that depend on projects on the list"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ALSO_MAKE_DEPENDENTS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"log-file"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Log file to where all build output will go."	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
LOG_FILE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"show-version"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Display version information WITHOUT stopping build"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
SHOW_VERSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"encrypt-master-password"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Encrypt master security password"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ENCRYPT_MASTER_PASSWORD	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"encrypt-password"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Encrypt server password"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
ENCRYPT_PASSWORD	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"threads"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
hasArg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Thread count, for instance 2.0C where C is core multiplied"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
THREADS	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"no-plugin-registry"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"npr"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"check-plugin-updates"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"cpu"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"update-plugins"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"up"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
options	TokenNameIdentifier
.	TokenNameDOT
addOption	TokenNameIdentifier
(	TokenNameLPAREN
OptionBuilder	TokenNameIdentifier
.	TokenNameDOT
withLongOpt	TokenNameIdentifier
(	TokenNameLPAREN
"no-plugin-updates"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
withDescription	TokenNameIdentifier
(	TokenNameLPAREN
"Ineffective, only kept for backward compatibility"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
"npu"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CommandLine	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cleanArgs	TokenNameIdentifier
=	TokenNameEQUAL
cleanArgs	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CommandLineParser	TokenNameIdentifier
parser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
GnuParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
parser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
options	TokenNameIdentifier
,	TokenNameCOMMA
cleanArgs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cleanArgs	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
cleaned	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
currentArg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
args	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
arg	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
boolean	TokenNameboolean
addedToBuffer	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arg	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cleaned	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentArg	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
arg	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
addedToBuffer	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
arg	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
cleanArgPart	TokenNameIdentifier
=	TokenNameEQUAL
arg	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
arg	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
addedToBuffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
currentArg	TokenNameIdentifier
.	TokenNameDOT
setLength	TokenNameIdentifier
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
currentArg	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
cleanArgPart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cleaned	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
cleaned	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
cleanArgPart	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentArg	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
addedToBuffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
currentArg	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
' '	TokenNameCharacterLiteral
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
arg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
cleaned	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
arg	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cleaned	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
currentArg	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
cleanedSz	TokenNameIdentifier
=	TokenNameEQUAL
cleaned	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
cleanArgs	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cleanedSz	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
cleanArgs	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
cleanArgs	TokenNameIdentifier
=	TokenNameEQUAL
cleaned	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
cleanedSz	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cleanArgs	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
displayHelp	TokenNameIdentifier
(	TokenNameLPAREN
PrintStream	TokenNameIdentifier
stdout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
stdout	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintWriter	TokenNameIdentifier
pw	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
stdout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
HelpFormatter	TokenNameIdentifier
formatter	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HelpFormatter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
formatter	TokenNameIdentifier
.	TokenNameDOT
printHelp	TokenNameIdentifier
(	TokenNameLPAREN
pw	TokenNameIdentifier
,	TokenNameCOMMA
HelpFormatter	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_WIDTH	TokenNameIdentifier
,	TokenNameCOMMA
"mvn [options] [<goal(s)>] [<phase(s)>]"	TokenNameStringLiteral
,	TokenNameCOMMA
" Options:"	TokenNameStringLiteral
,	TokenNameCOMMA
options	TokenNameIdentifier
,	TokenNameCOMMA
HelpFormatter	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_LEFT_PAD	TokenNameIdentifier
,	TokenNameCOMMA
HelpFormatter	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_DESC_PAD	TokenNameIdentifier
,	TokenNameCOMMA
" "	TokenNameStringLiteral
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pw	TokenNameIdentifier
.	TokenNameDOT
flush	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE